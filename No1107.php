<?php
    
    $array_number = explode(" ",trim(fgets(STDIN)));
    
    if($array_number[0] < $array_number[1] and $array_number[3] < $array_number[2]) {
        echo "YES";
    } else {
        echo "NO";
    }
    
?>
