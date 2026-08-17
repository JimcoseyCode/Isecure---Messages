.class Lg0/I$b;
.super Lg0/k0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg0/I;->T()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:Lg0/I;


# direct methods
.method constructor <init>(Lg0/I;Landroid/media/MediaCodec;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg0/I$b;->i:Lg0/I;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lg0/k0;-><init>(Landroid/media/MediaCodec;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public e(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg0/I$b;->i:Lg0/I;

    .line 2
    .line 3
    iget-boolean v1, v0, Lg0/I;->c:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {v0, p1, p2}, Lg0/I;->A(Lg0/I;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    :goto_0
    invoke-super {p0, p1, p2}, Lg0/k0;->e(J)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
