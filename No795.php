<?php
    
    $hundred_coins = trim(fgets(STDIN));
    $ten_coins = trim(fgets(STDIN));
    
    if($hundred_coins % 2 == 0 and $ten_coins % 2 == 0){
        echo "Yes".PHP_EOL;
    } else if (10 <= $ten_coins and $ten_coins % 2 == 0){
        echo "Yes".PHP_EOL;
    } else {
        echo "No".PHP_EOL;
    }
    
?>
