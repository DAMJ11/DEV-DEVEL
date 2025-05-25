const links = document.querySelectorAll('.nav-link-item');
links.forEach(link => {
    if (link.href === window.location.href) {
        link.classList.add('active');
    } else {
        link.classList.remove('active');
    }
});