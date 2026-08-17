.class public final synthetic LZ/O;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:LZ/S;

.field public final synthetic h:LZ/S$j;

.field public final synthetic i:J

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(LZ/S;LZ/S$j;JILjava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ/O;->g:LZ/S;

    .line 5
    .line 6
    iput-object p2, p0, LZ/O;->h:LZ/S$j;

    .line 7
    .line 8
    iput-wide p3, p0, LZ/O;->i:J

    .line 9
    .line 10
    iput p5, p0, LZ/O;->j:I

    .line 11
    .line 12
    iput-object p6, p0, LZ/O;->k:Ljava/lang/Throwable;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, LZ/O;->g:LZ/S;

    .line 2
    .line 3
    iget-object v1, p0, LZ/O;->h:LZ/S$j;

    .line 4
    .line 5
    iget-wide v2, p0, LZ/O;->i:J

    .line 6
    .line 7
    iget v4, p0, LZ/O;->j:I

    .line 8
    .line 9
    iget-object v5, p0, LZ/O;->k:Ljava/lang/Throwable;

    .line 10
    .line 11
    invoke-static/range {v0 .. v5}, LZ/S;->h(LZ/S;LZ/S$j;JILjava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
