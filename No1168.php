<?php
    $n = trim(fgets(STDIN));
    $result = 0;
    for($i = 0; $i < 100; $i++) {
        
        while($n >= 1) {
            $result += $n % 10;
            $n = $n / 10;
        }
        $n = $result;
        $result = 0;
        
    }
    
    echo $n;
?>
