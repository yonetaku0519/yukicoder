<?php

    $A = str_split(trim(fgets(STDIN)));
    $S = str_split(trim(fgets(STDIN)));
    sort($A);
    sort($S);
    
    if($A == $S) {
        echo "YES".PHP_EOL;
    } else {
        echo "NO".PHP_EOL;
    }
    
?>