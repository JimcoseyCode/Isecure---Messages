.class final LN5/l$a;
.super Ljava/io/Writer;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN5/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN5/l$a$a;
    }
.end annotation


# instance fields
.field private final g:Ljava/lang/Appendable;

.field private final h:LN5/l$a$a;


# direct methods
.method constructor <init>(Ljava/lang/Appendable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LN5/l$a$a;

    .line 5
    .line 6
    invoke-direct {v0}, LN5/l$a$a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LN5/l$a;->h:LN5/l$a$a;

    .line 10
    .line 11
    iput-object p1, p0, LN5/l$a;->g:Ljava/lang/Appendable;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    return-void
.end method

.method public flush()V
    .locals 0

    .line 1
    return-void
.end method

.method public write(I)V
    .locals 1

    .line 3
    iget-object v0, p0, LN5/l$a;->g:Ljava/lang/Appendable;

    int-to-char p1, p1

    invoke-interface {v0, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void
.end method

.method public write([CII)V
    .locals 1

    .line 1
    iget-object v0, p0, LN5/l$a;->h:LN5/l$a$a;

    iput-object p1, v0, LN5/l$a$a;->g:[C

    .line 2
    iget-object p1, p0, LN5/l$a;->g:Ljava/lang/Appendable;

    add-int/2addr p3, p2

    invoke-interface {p1, v0, p2, p3}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

    return-void
.end method
