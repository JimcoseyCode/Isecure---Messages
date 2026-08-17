.class LZ7/h;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final g:LL7/e;

.field private final h:LZ7/i;

.field private final i:LC8/d0;

.field private final j:LZ7/a;


# direct methods
.method public constructor <init>(LL7/e;LZ7/i;LC8/d0;LZ7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ7/h;->g:LL7/e;

    .line 5
    .line 6
    iput-object p2, p0, LZ7/h;->h:LZ7/i;

    .line 7
    .line 8
    iput-object p3, p0, LZ7/h;->i:LC8/d0;

    .line 9
    .line 10
    iput-object p4, p0, LZ7/h;->j:LZ7/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LZ7/h;->g:LL7/e;

    .line 2
    .line 3
    iget-object v1, p0, LZ7/h;->h:LZ7/i;

    .line 4
    .line 5
    iget-object v2, p0, LZ7/h;->i:LC8/d0;

    .line 6
    .line 7
    iget-object v3, p0, LZ7/h;->j:LZ7/a;

    .line 8
    .line 9
    check-cast p1, LD8/g;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, p1}, LZ7/i;->i(LL7/e;LZ7/i;LC8/d0;LZ7/a;LD8/g;)LC8/d0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
