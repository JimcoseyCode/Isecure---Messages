.class LJ1/r$d$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ1/r$d$a;->b(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:Z

.field final synthetic h:LJ1/r$d$a;


# direct methods
.method constructor <init>(LJ1/r$d$a;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ1/r$d$a$a;->h:LJ1/r$d$a;

    .line 2
    .line 3
    iput-boolean p2, p0, LJ1/r$d$a$a;->g:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, LJ1/r$d$a$a;->h:LJ1/r$d$a;

    .line 2
    .line 3
    iget-boolean v1, p0, LJ1/r$d$a$a;->g:Z

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LJ1/r$d$a;->a(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
