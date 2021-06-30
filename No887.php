<?php
    
    $n = trim(fgets(STDIN));
    $i = 0;
    $max = $n;
    while(true) {
        
        if($n == 1) {
            break;
        }
        
        if($max < $n) {
            $max = $n;
        }
        
        if($n % 2 == 0) {
            $n = $n / 2;
            $i++;
        } else {
            $n = ($n * 3) + 1;
            $i++;
        }
        
        
        
    }
    echo $i.PHP_EOL;
    echo $max.PHP_EOL;
    
?>
