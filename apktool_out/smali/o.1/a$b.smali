.class abstract Lo/a$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method static a(Lo/a$d;)Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;
    .locals 1

    .line 1
    new-instance v0, Lo/a$b$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lo/a$b$a;-><init>(Lo/a$d;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
