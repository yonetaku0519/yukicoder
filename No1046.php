<?php
    
    $num = explode(" ", trim(fgets(STDIN)));
    $numA = explode(" ", trim(fgets(STDIN)));
    
    rsort($numA);
    $result = $numA[0];
    
    for($i = 1; $i < $num[1]; $i++) {
        if($numA[$i] > 0){
            $result += $numA[$i];
        }
    
    }
    echo $result.PHP_EOL;
    
?>
