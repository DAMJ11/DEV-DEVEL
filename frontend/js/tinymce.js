tinymce.init({
    selector: '#editor',
    plugins: 'image link lists advcolor',
    toolbar: 'undo redo | bold italic underline | forecolor backcolor | bullist numlist | link ', /* añadir ''image'' junto a 'link' para funcionalidad de subir imágenes*/
    height: 300,
    menubar: false,
    content_style: `
                    body {
                    font-family: Consolas, monospace;
                    font-size: 1rem;
                    background-color:rgb(241, 241, 241);
                    outline: none;
                    }`});