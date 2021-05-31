<?php
    $A = fgets(STDIN);
    $S = fgets(STDIN);
    
    $array_A = str_split($A);
    $array_S = str_split($S);
    
    for($i = 0; $i < strlen($S); $i++) {
        if('0' <= $array_S[$i] && $array_S[$i] <= '9'){
            echo $array_A[$array_S[$i]];
        } else {
            echo $array_S[$i];
        }
    }
?>
