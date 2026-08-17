.class public final synthetic LF0/i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:LF0/s;

.field public final synthetic h:LF0/g$e;


# direct methods
.method public synthetic constructor <init>(LF0/s;LF0/g$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF0/i;->g:LF0/s;

    .line 5
    .line 6
    iput-object p2, p0, LF0/i;->h:LF0/g$e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LF0/i;->g:LF0/s;

    .line 2
    .line 3
    iget-object v1, p0, LF0/i;->h:LF0/g$e;

    .line 4
    .line 5
    invoke-static {v0, v1}, LF0/g$b;->a(LF0/s;LF0/g$e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
