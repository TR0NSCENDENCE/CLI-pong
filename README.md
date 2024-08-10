# Pong CLI

This project is a pong CLI that connects to our [transcendence](https://github.com/TR0NSCENDENCE/TR0NSCENDENCE).

## Building the project

### Dependencies
- `Java 11`
- `Maven`
- `Makefile`

### Building

The build system is done via a `Makefile`.

The rules are:

- #### `all`
	> Builds the executable.

- #### `run`
	> Builds the executable if needed then runs the executable.

- #### `clean`
	> Removes all the files generated for the compilation AND the executable.
