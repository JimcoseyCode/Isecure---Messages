.class public final synthetic Lc0/m;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lc0/n;

.field public final synthetic h:Lc0/n$c;


# direct methods
.method public synthetic constructor <init>(Lc0/n;Lc0/n$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc0/m;->g:Lc0/n;

    .line 5
    .line 6
    iput-object p2, p0, Lc0/m;->h:Lc0/n$c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc0/m;->g:Lc0/n;

    .line 2
    .line 3
    iget-object v1, p0, Lc0/m;->h:Lc0/n$c;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lc0/n;->i(Lc0/n;Lc0/n$c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
