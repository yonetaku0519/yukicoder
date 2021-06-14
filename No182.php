<?php
    
    $num = trim(fgets(STDIN));
    $array_num = explode(" ",trim(fgets(STDIN)));
    $count = array_count_values($array_num);
    $result = 0;
    
    
    foreach($count as $value) {
        if($value == 1) {
            $result++;
        }
    }
    
    echo $result;
    
?>
