import requests

# URL de base de l'API
base_url = 'http://localhost:8080'  # Remplacez par l'URL correcte de votre API

# Fonction pour effectuer une requête GET
def get_request(endpoint):
    url = f'{base_url}/{endpoint}'
    response = requests.get(url)
    return response.json()

# Fonction pour effectuer une requête POST
def post_request(endpoint, data):
    url = f'{base_url}/{endpoint}'
    headers = {'Content-Type': 'application/json'}
    response = requests.post(url, json=data, headers=headers)
    return response.json()

# Fonction pour effectuer une requête DELETE
def delete_request(endpoint):
    url = f'{base_url}/{endpoint}'
    response = requests.delete(url)
    return response.status_code


# Requêtes pour les équipes

# Créer une nouvelle équipe
new_equipe = {
    'name': 'Nouvelle équipe',
    'colors': 'Rouge, Blanc'
}
created_equipe = post_request('equipe', new_equipe)
print(created_equipe)

# Récupérer toutes les équipes
all_equipe = get_request('equipe')
print(all_equipe)

# Récupérer une équipe par ID
equipe_id = 1
equipe = get_request(f'equipe/{equipe_id}')
print(equipe)


# Supprimer une équipe par ID
delete_equipe_id = 2
delete_status = delete_request(f'equipe/{delete_equipe_id}')
print(delete_status)


# Créer un nouveau joueur
new_joueur = {
    'nom': 'John',
    'prenom': 'Doe',
    'equipeId': 1
}


created_joueur = post_request('joueur', new_joueur)
print(created_joueur)

# Récupérer tous les joueurs
all_joueur = get_request('joueur')
print(all_joueur)

## Selectionner un joueur en particulier
joueur_id = 1
joueur = get_request(f'joueur/{joueur_id}')
print(joueur)
# Supprimer un joueur par ID
delete_joueur_id = 3
delete_status = delete_request(f'joueur/{delete_joueur_id}')
print(delete_status)
