<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
</head>
<body>
    <?php
        $n = 1234567789;
        $sum = 0;
        echo "<h2>The number is $n <br>";
        while($n>0){
            $rem = $n % 10;
            $sum += $rem;
            $n = intdiv($n, 10);
        }
        echo "The sum of digits is $sum";

    ?>
</body>
</html>