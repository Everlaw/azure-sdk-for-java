## Updating this package

This repository is a fork of Azure's OpenAI Java SDK (among other things).

The specific package we use is located in `sdk/openai/azure-ai-openai`.

### Merging upstream updates

If the original repository has changes that need to be included in our fork, follow the instructions [here](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/working-with-forks/syncing-a-fork) for syncing our fork.

Specifically, configure the upstream repository as a remote for this repository, fetch all tags with `git fetch --tags upstream`, and then merge upstream changes into your local branch using `git merge <tag>`.

After the changes are merged, follow the instructions below for updating the version of this package and publishing a new version.

### Making local changes

If something specific to our fork needs to be changed, make the changes in a new branch.

Ensure any files that you modify for the first time contain our copyright notice as defined in the "Modifying Packages Included in the Everlaw Platform" section of [this doc](https://drive.google.com/file/d/1Qio1Une8HvL7DZMjQMieljgpZ5rWpvwR/view).

Open a pull request targeting the `origin/main` branch of this repository.

**Note:** _Make sure the base of your PR is OUR FORK. **DO NOT** target PRs to the upstream fork._

Make your changes and find an appropriate reviewer to review them.

Follow testing instructions below.

Publish a new version according to the instructions below.

### Testing

If you build this package, it will install the built artifacts to your local Maven cache (usually located at `~/.m2/repository`).

Follow the instructions for building from [the upstream's wiki](https://github.com/Azure/azure-sdk-for-java/wiki/Building#pomclientxml-vs-pomdataxml).

Copy the jar file of the new version to `servers/lib/`.

You can then reference the version you just built in the `servers` repository.

**Note:** Make sure you're using Java 11 to build the package and that you change back to 17 (or whatever version we're using) before working on the `servers` repo again.

**Note:** The most useful commands from the wiki are:

 - `mvn install -f eng/code-quality-reports/pom.xml ` for installing build tools (one-time setup usually)
 - `mvn install -f sdk/openai/azure-ai-openai/pom.xml` for building the package we use

### Updating the version and publishing the package to Github

Once any changes are made and finalized, you'll want to bump the version we're hosting in our Github artifactory.

There are two steps:

1. Update the version

Our self-hosted version of this package started on `1.0.0-everlaw0`.

Any time we pull in upstream changes or make changes ourselves, we should bump the suffix one time (e.g. the first bump would have been to `1.0.0-everlaw1`).

Pulling in upstream changes will often cause a merge conflict with the version number.

Track what the version number was before syncing the fork, and make sure it's updated _after_ you've resolved any conflicts and made any new local changes after syncing.

2. Publish the package

The package we use is configured to deploy artifacts directly to our Github Packages repository.

a. Ensure you have a Github PAT that will allow you to read and write to our Github artifactory. Helpful instructions [here](https://everlaw.atlassian.net/wiki/spaces/ENG/pages/403963963/Github+Packages).

b. Run `mvn deploy -f sdk/openai/azure-ai-openai/pom.xml`

c. Go to [our artifactory](https://github.com/orgs/Everlaw/packages?repo_name=servers) and find the package. Ensure the latest version matches what you just uploaded.

d. Open a PR into `servers` to update the version of this package. Our CI process will ensure that the package can be downloaded from the artifactory.
