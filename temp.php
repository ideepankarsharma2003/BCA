<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- This is my php website -->
    <?php
        $n = 12321;
        $o = $n;
        $z = 0;
        $rem = 0;
        // echo $z==$rem;
        echo "<h2>The original number is '$n'<br>";
        // echo "The  is '$n'<br>";
        while($n>0){
            $rem = $n % 10;
            $z = $z*10+ $rem;
            // $n = $n / 10;
            $n = intdiv($n, 10);
            // echo "$n<br>";
        }
        echo "The reverse is: '$z'<br>";
    // echo $z == $o;
    if ($z == $o)
        echo "The number is a palindrome";
        else
            echo "The number is not a palindrome";
    ?>
</body>
</html>