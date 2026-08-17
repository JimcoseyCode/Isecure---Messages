.class Lo/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/a$b;,
        Lo/a$c;,
        Lo/a$d;
    }
.end annotation


# instance fields
.field private a:Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

.field private b:Lz0/a$c;

.field final c:Lo/a$d;


# direct methods
.method constructor <init>(Lo/a$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo/a;->c:Lo/a$d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method a()Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/a;->a:Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lo/a;->c:Lo/a$d;

    .line 6
    .line 7
    invoke-static {v0}, Lo/a$b;->a(Lo/a$d;)Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lo/a;->a:Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lo/a;->a:Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 14
    .line 15
    return-object v0
.end method

.method b()Lz0/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/a;->b:Lz0/a$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lo/a$a;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lo/a$a;-><init>(Lo/a;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/a;->b:Lz0/a$c;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/a;->b:Lz0/a$c;

    .line 13
    .line 14
    return-object v0
.end method
