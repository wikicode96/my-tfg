if(document.querySelector('#map')) {

    const lat = 36.72655812633922;
    const lng = -4.422172874246604;
    const zoom = 16;

    const map = L.map('map').setView([lat, lng], zoom);

    L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
        attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
    }).addTo(map);
    
    L.marker([lat, lng]).addTo(map)
        .bindPopup('<h2>Tienda fisica!</h2>')
        .openPopup();
}