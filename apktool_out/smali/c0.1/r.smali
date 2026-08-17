.class public final synthetic Lc0/r;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lc0/p$a;

.field public final synthetic h:Z


# direct methods
.method public synthetic constructor <init>(Lc0/p$a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc0/r;->g:Lc0/p$a;

    .line 5
    .line 6
    iput-boolean p2, p0, Lc0/r;->h:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc0/r;->g:Lc0/p$a;

    .line 2
    .line 3
    iget-boolean v1, p0, Lc0/r;->h:Z

    .line 4
    .line 5
    invoke-static {v0, v1}, Lc0/s;->c(Lc0/p$a;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
