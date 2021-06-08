<?php
    
    $array_n = explode(" ",trim(fgets(STDIN)));
    $x = abs($array_n[0]);
    $y = abs($array_n[1]);
    $r = abs($array_n[2]);
    
    $result = $x + $y + ($r * 1.41421356);
    
    echo ceil($result).PHP_EOL;
?>
