
This README file explains how to Fat Tree program Using Java 
by
Mayank Sharma



---- RUN IN AN IDE ----

If you want to run the this program in an IDE, such as Eclipse, you should
be able to copy-and-paste the entire contents of this code
into a project in the IDE, and then run the programs. 

---- COMPILE AND RUN ON THE COMMAND LINE ----

If you know how to compile program on the command line, and if you have
downloaded the java libraries, you can easily compile and run all the examples.
For non-GUI programs, just change into the program directories inside 
the "sources" directory, and use a command of the form

                  javac ExampleClassName.ajavaa
                  
---- MAKE EXECUTABLE JAR FILES -----
                  
If you find it easier to run programs by double-clicking, you can 
use clickable, executable jar files to run the non-JavaFX examples, but you 
need to create the jar files.  You can also use executable jar files
to run the JavaFX programs, but you will still need to run those
jar files on the command line.

If you are running Mac or Linux, just open a Terminal window and change 
into the "sources" directory.  If you want to make .jar files for the
GUI programs as well as for the non-GUI programs, you will need to
edit the "make-jar-files.sh" script to tell it where to find the
JavaFX SDK.  See the comments in that file for more information.  To run
the script named "make-jar-files.sh", use the command:

                 ./make-jar-files.sh
                 
If you are running Windows, just open a DOS command window and change 
into the "sources" directory.  If you want to build jar files for JavaFX
files, edit the "make-jar-files.bat" script to tell it where to find
the JavaFX SDK; if you do not do this, the script will only build the
non-JavaFX jar files.  To run the script, use the command

                 make-jar-files.bat
                 
These commands build the executable jar files for the examples.  They will
create a folder named "compiled-jar-files" inside the "sources" folder to hold
the jar files.  Inside "compiled-jar-files", the jar files will be organized 
by chapter.  The script will take some time to run, since there are a lot of 
examples.

For the non-JavaFX files, you should be able to run an executable jar file
just by double-clicking it.  (On Linux, you might have to right-click it 
and select a command such as "Open with... JDK 17".)  For programs that 
use JavaFX, you will need to run the jar file on the command line, using
a java command with JavaFX options added, as discussed in Section 2.6.7.
The exact command depends on the location of the JavaFX SDK on your system,
but a typical command would be something like

   java -p /opt/javafx-sdk-17/lib --add-modules=ALL-MODULE-PATH -jar JarFileName.jar
   
Note that programs that are meant to be run on the command line, such as
those that use TextIO, will be packaged in their jar files with a special
version of TextIO that runs in its own window (without using JavaFX).  
The window is opened when you execute the jar file.  You will have to 
close the window, by clicking its close button, when the program ends.
The GUI version of TextIO can be found in the package "textiogui" inside
the "sources" folder.  See the classes in that package for information 
about how to use it, if you are interested in using it for your own 
programs.  (For Windows, the files for TextIO that are used in 
the .jar files can be found in the folder "textio-for-windows-jar-files" 
inside the sources folder. Those files should not be used for other 
purposes.  They are, basically, a kludge that I had to use when writing 
the .bat script for Windows.)

There are several examples for which jar files are not made in any case.  There 
are several reasons for leaving them out.  For example, some require command-line
arguments and so cannot be run by double-clicking the jar file.
