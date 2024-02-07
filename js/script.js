const details = {
    songs : [
        {
            id: 1,
            name: 'Sugar - Maroon 5',
            artist : 'Maroon 5',
            image: 'https://www.pagalwrold.com/siteuploads/thumb/sft6/2729_4.jpg',
            genre: 'Pop',
            source: 'https://www.pagalwrold.com/files/download/id/2729',
        },
        {
            id: 2,
            name: 'Ram Aaye Hai Mp3',
            artist : 'KD Desi Rock',
            image: 'https://www.pagalwrold.com/siteuploads/thumb/sft36/17939_4.jpg',
            genre: 'Rock',
            source: 'https://www.pagalwrold.com/files/download/id/17939',
        },
        {
            id: 3,
            name: 'Bam Bam Bol Raha Hai Kashi Mp3',
            artist : '	Kailash Kher',
            image: 'https://www.pagalwrold.com/siteuploads/thumb/sft36/17596_4.jpg',
            genre: 'Rock',
            source: 'https://www.pagalwrold.com/files/download/id/17596',
        }
    ],

    select_options: ['Rock','Pop','hiphop']
}


function toggleMode() {
    var element = document.body;
    console.log(selectSong.value);
   element.classList.toggle("dark-mode");
}



const song_div = document.getElementById('All-song-div');
const selectSong = document.createElement('select');

selectSong.addEventListener('change',()=>{
    console.log('change happend');
    console.log(selectSong.value);
})

details.select_options.forEach((opt)=>{
    option = document.createElement('option');
    option.value = opt; // Set the value attribute
    option.textContent = opt;
    selectSong.appendChild(option);
})

song_div.appendChild(selectSong);




