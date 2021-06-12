<?php
    
    $array_line = explode(" ",trim(fgets(STDIN)));
    switch ($array_line[2]) {
        case '<':
            echo $array_line[0] < $array_line[1] ? "YES" : "NO";
            break;
            
        case '>':
            echo $array_line[0] > $array_line[1] ? "YES" : "NO";
            break;
        
        default:
            echo $array_line[0] == $array_line[1] ? "YES" : "NO";
            break;
    
    }
    
?>
