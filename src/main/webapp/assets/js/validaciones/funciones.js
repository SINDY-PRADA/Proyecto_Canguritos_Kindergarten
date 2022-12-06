(document).ready(function () {
    $("tr #eliminar").click(function (e) {
        e.preventDefault();
         var idAcudiente = $(this).parent().find('#acudiente').val();
        swal({
             title: "Esta Seguro de Eliminar?",
            text: "Una vez eliminado deberá agregar de nuevo!",
            type: "warning",
            showCancelButton: true,
            confirmButtonClass: "btn-danger",
           confirmButtonText: "Sí, Eliminar!",
            cancelButtonText: "No, Cancelar!",
            closeOnConfirm: false,
            closeOnCancel: false
         },
                 function (isConfirm) {
                   if (isConfirm) {
                        eliminarAcudiente(idAcudiente);
                         swal("Eliminado!", "El acudiente se ha eliminado", "success");
                         setTimeout(function (){
                            parent.location.href = "acudiente?accion=consultarAcudiente"
                        }, 1800);
                   } else {
                         swal("Cancelado", "Cancelaste la eliminación", "error");                    }
                 });
     });

     function eliminarAcudiente(idAcudiente) {
        var url = "estudiante?accion=eliminarEstudiante&idEstudiante=${estudianteList.getIdEstudiante()}" + idEstudiante;
        console.log("eliminado");
       $.ajax({
            type: 'POST',
            url: url,
            async: true,
             success: function (r) {
                
            }
         });
     }
});

