<?php
    
    $num = explode(" ",trim(fgets(STDIN)));
    $flag = 0;
    for($i = 0;$i < count($num);$i++) {
        if($num[$i] % 3 == 0){
            echo "Yes".PHP_EOL;
            $flag = 1;
            break;
        }
    }
    if($flag == 0) {
        echo "No".PHP_EOL;
    }
    
?>
