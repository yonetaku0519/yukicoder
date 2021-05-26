<?php
    
    $list = fgets(STDIN);
    $array = explode(' ',$list);
    $ans = $array[1]/$array[0];
    echo ceil($ans);
    
?>