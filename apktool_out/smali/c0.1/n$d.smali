.class Lc0/n$d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lc0/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lc0/n;


# direct methods
.method constructor <init>(Lc0/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc0/n$d;->a:Lc0/n;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc0/n$d;->a:Lc0/n;

    .line 2
    .line 3
    iput-boolean p1, v0, Lc0/n;->q:Z

    .line 4
    .line 5
    iget-object p1, v0, Lc0/n;->g:Lc0/n$e;

    .line 6
    .line 7
    sget-object v1, Lc0/n$e;->h:Lc0/n$e;

    .line 8
    .line 9
    if-ne p1, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lc0/n;->s()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
