<?php
    $line = fgets(STDIN);
    $array = explode(' ',$line);
    if($array[0] + $array[1] == $array[2]) {
        echo 'Correct';
    } else {
        echo 'Incorrect';
    }

?>