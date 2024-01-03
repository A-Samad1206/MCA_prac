#! /usr/bin/bash

NAME=hello
echo hello ${NAME};
echo "Enter your name"
read val1
read val2

# echo you entered $NAMEX

: <<'COMMENT'
Numeric relational operator
-eq
-ne
-gt
-ge
-lt
-le
String relational operator
= 
> 
<
!=

Logical operator
! NOT
-a or &&
-o or ||

echo one $val1
echo two $val2

echo $((val1 + val2))

if [ $((val1 % 2)) -eq 0 ]; then
    echo $val1 is even
fi

if [ $val1 -lt $val2 ]; then
     echo one is less then two;
elif [ $val1 -eq $val2 ]; then 
    echo equal;
else [ $val1 -gt $val2 ]
     echo one is greater then two;
fi
COMMENT


: <<'COMMENT'
File-related conditions to test the properties and characteristics of files,
such as whether a file exists, is a directory, is readable, is writable, and more.

-f
-d
-w
-r
-x
-s = file size is non-zero 
-h = file is symbolic link
if [ -e "/path/to/file" ]; then
    echo "The file exists."
fi
if [ -f "/path/to/file" ]; then
    echo "It's a regular file."
fi
if [ -d "/path/to/directory" ]; then
    echo "It's a directory."
fi
if [ -r "/path/to/file" ]; then
    echo "The file is readable."
fi
if [ -w "/path/to/file" ]; then
    echo "The file is writable."
fi
if [ -x "/path/to/file" ]; then
    echo "The file is executable."
fi
if [ -h "/path/to/file" ]; then
    echo "It's a symbolic link."
fi

COMMENT

if [ ! -s "/path/to/file" ]; then
    echo "The file is non-empty."
fi

FILES=$(ls *.sh)
for FILE in $FILES
do 
    echo $FILE
    # mv $FILE $FILE-NEW
done



function greet() {
    echo hello $1 and $2
}

greet arg1 arg2