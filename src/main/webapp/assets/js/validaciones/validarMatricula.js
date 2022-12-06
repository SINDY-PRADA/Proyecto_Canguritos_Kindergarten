$(document).on('change','input[type="file"]',function(){
	// this.files[0].size recupera el tamaño del archivo
	// alert(this.files[0].size);
	
	var fileName = this.files[0].name;
	var fileSize = this.files[0].size;

	if(fileSize > 2000000){
		alert('El archivo no debe superar los 2MB');
		this.value = '';
		this.files[0].name = '';
	}else{
		// recuperamos la extensión del archivo
		var ext = fileName.split('.').pop();
		
		// Convertimos en minúscula porque 
		// la extensión del archivo puede estar en mayúscula
		ext = ext.toLowerCase();
    
		// console.log(ext);
		switch (ext) {
			case 'pdf': break;
			default:
				alert('El archivo no tiene la extensión adecuada');
				this.value = ''; // reset del valor
				this.files[0].name = '';
		}
	}
});