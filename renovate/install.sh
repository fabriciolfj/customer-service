helm install --generate-name \
    --set-file renovate.config=config.json \
    --set cronjob.schedule='*/1 * * * *' \
    --set existingSecret=renovate-secrets \
    renovate/renovate -n customer