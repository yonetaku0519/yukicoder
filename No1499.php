<?php
    
    $T = trim(fgets(STDIN));
    
    for($i = 0; $i < $T; $i++) {
        
        $text = explode(" ",trim(fgets(STDIN)));
        
        echo $text[0]." ".$text[1]." ".($text[2] + 1)." ".$text[3]." ".PHP_EOL;
        
    }
    
?>