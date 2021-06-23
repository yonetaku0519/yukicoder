<?php
    
    $num = explode(" ",trim(fgets(STDIN)));
    $before = explode(" ",trim(fgets(STDIN)));
    $after = array();
    
    for($i = 0; $i < $num[0]; $i++) {
        $after[$i] = $before[$i] + $num[1];
        echo $after[$i]." ";
    }
    
    echo PHP_EOL;
    
    
?>
