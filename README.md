Applied-Energistics-2-API
=========================

The API for Applied Energistics 2. It is open source to discuss changes, improve documentation, and provide better add-on support in general.

The Main mod is presently not available, and this is just the current version while it is being developed.

Maven
=========================

When compiling against the AE2 API you can use gradle dependencies, just add

dependencies {
	compile "appeng:appliedenergistics2:rv_-_____-__:dev"
}

or add the compile line to your existing dependencies task to your build.gradle

Where the __ are filled in with the correct version criteria; AE2 is available from the default forge maven so no additional repositories are necessary.
