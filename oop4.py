class mahasiswa:
    def __init__(self, nama, nim):
        self.nama = nama
        self.nim = nim

    def tampilkan_data(self):
        print("data mahasiswa:")
        print("Nama: ", self.nama)
        print("NIM: ", self.nim)

mhs1 = mahasiswa("Budi", "1234")
mhs2 = mahasiswa("Waa", "5678")

print("Data Mahaiswas:")
mhs1.tampilkan_data()
mhs2.tampilkan_data()

class Dog:
    def __init__(self, name, breed, noise, weight, colour):
        self.name = name
        self.breed = breed
        self.noise = noise
        self.weight = weight
        self.colour = colour

    def bark(self):
        print(self.noise)

dog = Dog("Bailey", "Shiba inu", "brown", "arf-arf", 20.2)
dog1 = Dog("Meily", "Poodle", "white", "arf-arf", 10.4)
dog2 = Dog("Boy", "bulldog", "white", "guk-guk", 30.8)

dog.bark()
dog1.bark()
dog2.bark()

