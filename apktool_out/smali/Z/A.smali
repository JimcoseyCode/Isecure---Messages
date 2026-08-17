.class public final synthetic LZ/A;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:LZ/S;

.field public final synthetic h:LZ/S$j;


# direct methods
.method public synthetic constructor <init>(LZ/S;LZ/S$j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ/A;->g:LZ/S;

    .line 5
    .line 6
    iput-object p2, p0, LZ/A;->h:LZ/S$j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LZ/A;->g:LZ/S;

    .line 2
    .line 3
    iget-object v1, p0, LZ/A;->h:LZ/S$j;

    .line 4
    .line 5
    invoke-static {v0, v1}, LZ/S;->s(LZ/S;LZ/S$j;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
