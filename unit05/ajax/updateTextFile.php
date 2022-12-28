<?php

// get the text from the request
$text = "This is the modified text , I willl write.........";
echo $text;

// open the text file for writing
$file = fopen("text.txt", "w");

// write the new text to the file
fwrite($file, $text);

// close the file
fclose($file);


echo "Done ....";

?>
