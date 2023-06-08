<?php

    $server_name="localhost";

    $username="root";

    $password="";

    $database_name="my_database";

    $conn=mysqli_connect($server_name,$username,$password,$database_name);

    // Check connection
    if (mysqli_connect_error()) {
        echo "Connection establishing failed!";
    } else {
        echo "Connection established successfully.";
    }
    
    $query = "Select * from students;";
    $res= mysqli_query($conn, $query);

    echo "<table border='1'>
        <tr>
            <th>Roll No</th>
            <th>Name</th>
        </tr>";

    while($row= mysqli_fetch_array($res, MYSQLI_ASSOC)){
        echo "<tr>
            <td>$row[rollno]</td>
            <td>$row[name]</td>
        </tr>";
    }
    
    echo "</table>";
?>