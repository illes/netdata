Netdata Server Code {#servercode}
==============================================

`src/` contains the sources for building `netdata` and `apps.plugin`

# Overview

To get an overview where to find the desired functionality check Files -> File List.

# Coding Conventions
 
## Documenation
Header files must be documented with [doxygen](http://www.stack.nl/~dimitri/doxygen/manual/docblocks.html).

## Searching for strings
To search for `string` in a collection always do this for performance:
- Store a hash of the string in the object: `uint32_t hash = simple_hash(string);`
- All `strcmp()` should be `if( hash == object->hash && !strcmp(string, object->string) )`.