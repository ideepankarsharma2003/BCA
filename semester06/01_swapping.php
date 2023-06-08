<?php
// Swap two numbers using a temporary variable
$num1 = 10;
$num2 = 20;
echo "<h1>SWAPPING PROGRAM";
echo "<h3>Before swapping: ";
echo "num1 = " . $num1 . ", num2 = " . $num2 . "<br>";
$temp = $num1;
$num1 = $num2;
$num2 = $temp;
echo "After swapping: ";
echo "num1 = " . $num1 . ", num2 = " . $num2;
?>