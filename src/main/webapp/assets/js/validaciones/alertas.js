function ConfirmDatos()
 {
     var actualizar = confirm("¿Desea actualizar este registro?");

     if(actualizar == true)
     {
         return true;
     }
     else
     {
         return false;
     }
 };


 function ConfirmEstado()
 {
     var estado = confirm("¿Esta seguro de cambiar el estado de este registro");

     if(estado == true)
     {
         return true;
     }
     else
     {
         return false;
     }
};

    function ConfirmEliminar()
 {
     var eliminar = confirm("¿Está seguro de eliminar este registro?");

     if(eliminar == true)
     {
         return true;
     }
     else
     {
         return false;
     }
 }
 

    function ConfirmRegistro()
    {
        var registro = alert("Sus datos se registraron de manera éxitosa");
    };

    
    function ConfirmEdicion()
    {
        var edicion = alert("Sus datos se editaron de manera éxitosa");
    };

    
        