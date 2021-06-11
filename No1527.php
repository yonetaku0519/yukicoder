<?php
    
    $array_number = explode(" ",trim(fgets(STDIN)));
    if($array_number[0] <= $array_number[1]){
        echo "Yes";
    } else {
        echo "No";
    }
    
?>
