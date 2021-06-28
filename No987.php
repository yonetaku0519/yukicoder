<?php
    
    $n = explode(" ",trim(fgets(STDIN)));
    $b = explode(" ",trim(fgets(STDIN)));
    $op = $b[0];
    
    for($i = 0;$i < $n[0];$i++) {
        $a = trim(fgets(STDIN));
        
        for($k = 1; $k <= $n[1]; $k++) {
            if($op == "+") {
                echo ((int)$a + (int)$b[$k])." ";
            }else {
                echo ((int)$a * (int)$b[$k])." ";
            }
        }
        
        echo "\n";

    }
?>
