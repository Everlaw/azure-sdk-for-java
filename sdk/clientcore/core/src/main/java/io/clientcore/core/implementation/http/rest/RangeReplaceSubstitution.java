// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.implementation.http.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A range replace substitution is a substitution that replaces a range of characters in a String with the supplied
 * value. This type of substitution is commonly used for host and path replacements where the Swagger interface will
 * have a definition such as {@code @Host("{uri}")} which will be replaced with a value such as
 * {@code https://somecloud.com}.
 * <p>
 * Before the introduction of this replacement {@link String#replace(CharSequence, CharSequence)} was used which would
 * generate a {@code Pattern} to perform replacing.
 */
class RangeReplaceSubstitution extends Substitution {
    private final List<Range> ranges;

    /**
     * Create a new Substitution.
     *
     * @param uriParameterName The name that is used between curly quotes as a placeholder in the target URI.
     * @param methodParameterIndex The index of the parameter in the original interface method where the value for the
     * placeholder is.
     * @param shouldEncode Whether the value from the method's argument should be encoded when the substitution is
     * taking place.
     * @param substitutionBase The string that will have its ranges substituted.
     */
    RangeReplaceSubstitution(String uriParameterName, int methodParameterIndex, boolean shouldEncode,
        String substitutionBase) {
        super(uriParameterName, methodParameterIndex, shouldEncode);
        this.ranges = new ArrayList<>();

        String placeholder = "{" + uriParameterName + "}";
        int indexOf = 0;
        while (true) {
            indexOf = substitutionBase.indexOf(placeholder, indexOf);

            if (indexOf == -1) {
                break;
            }

            ranges.add(new Range(indexOf, indexOf + placeholder.length()));
            indexOf = indexOf + placeholder.length();
        }
    }

    List<Range> getRanges() {
        return ranges;
    }

    static final class Range implements Comparable<Range> {
        private final int start;
        private final int end;

        Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        int getStart() {
            return start;
        }

        int getEnd() {
            return end;
        }

        int getSize() {
            return end - start;
        }

        @Override
        public int compareTo(Range o) {
            if (start < o.start) {
                return -1;
            } else if (start > o.start) {
                return 1;
            } else {
                return Integer.compare(end, o.end);
            }
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Range)) {
                return false;
            }

            Range other = (Range) obj;

            return start == other.start && end == other.end;
        }
    }
}
