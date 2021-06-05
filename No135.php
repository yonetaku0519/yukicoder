<?php
    $N = trim(fgets(STDIN));
    $n = explode(' ', trim(fgets(STDIN)));
    sort($n);
    $result = 0;
    
    for($i = 0; $i < $N - 1; $i++) {
        
        $distance = $n[$i + 1] - $n[$i];
        
        if($result == 0){
            $result = $distance;
        
        } elseif($distance <= $result and $distance != 0) {
            $result = $distance;
            
        }
    }
    
    echo $result.PHP_EOL;
    
?>
