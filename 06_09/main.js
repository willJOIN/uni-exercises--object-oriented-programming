class Animal {
    constructor() {
        if (this.constructor === Animal) {
            throw new Error('Abstract classes cannot be instanciated.');
        }
        this.familia;
        this.especie;
    }
    fazerSom() {
        throw new Error("Method 'say' must be implemented");
    }
}

class Cachorro extends Animal {
    familia = 'Canidae';
    especie;

    fazerSom() {
        return('au');
    }
}

class Gato extends Animal {
    familia = 'Felidae';
    especie;

    fazerSom() {
        return('miau');
    }
}

let guibi = new Cachorro();
let sissi = new Cachorro();
let fumaca = new Gato();
let angela = new Gato();

guibi.especie = 'Shih Tzu';
sissi.especie = 'Sheltie';
fumaca.especie = 'British Shorthair';
fumaca.especie = 'American Alley';

console.log(guibi.fazerSom(), sissi.fazerSom(), fumaca.fazerSom(), angela.fazerSom())