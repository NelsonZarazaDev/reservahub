CREATE TABLE service_offerings(
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  organization_id UUID NOT NULL,
  name VARCHAR(150) NOT NULL,
  duration_minutes INTEGER NOT NULL CHECK ( duration_minutes > 0 ),
  price NUMERIC(12,2) NOT NULL CHECK ( price >= 0 ),
  active BOOLEAN NOT NULL DEFAULT TRUE,
  created_at TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP,

  CONSTRAINT FK_ORGANIZATION_SERVICE_OFFERINGS
      FOREIGN KEY (organization_id)
          REFERENCES organizations(id)
);