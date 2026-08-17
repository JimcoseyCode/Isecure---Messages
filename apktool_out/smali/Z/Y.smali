.class public final synthetic LZ/Y;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:LZ/S$k;

.field public final synthetic h:Ly/I0;

.field public final synthetic i:LF/v1;


# direct methods
.method public synthetic constructor <init>(LZ/S$k;Ly/I0;LF/v1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ/Y;->g:LZ/S$k;

    .line 5
    .line 6
    iput-object p2, p0, LZ/Y;->h:Ly/I0;

    .line 7
    .line 8
    iput-object p3, p0, LZ/Y;->i:LF/v1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LZ/Y;->g:LZ/S$k;

    .line 2
    .line 3
    iget-object v1, p0, LZ/Y;->h:Ly/I0;

    .line 4
    .line 5
    iget-object v2, p0, LZ/Y;->i:LF/v1;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LZ/S$k;->a(LZ/S$k;Ly/I0;LF/v1;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
